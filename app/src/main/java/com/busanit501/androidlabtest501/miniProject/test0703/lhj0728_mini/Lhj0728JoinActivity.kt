package com.busanit501.androidlabtest501.miniProject.test0703.lhj0728_mini

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityLhj0728JoinBinding
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

class Lhj0728JoinActivity : AppCompatActivity() {

    lateinit var binding: ActivityLhj0728JoinBinding
    lateinit var filePath : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLhj0728JoinBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_lhj0728_join)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val requestGalleryLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            try {
                val calRatio = calculateInSampleSize(
                    it.data!!.data!!,
                    resources.getDimensionPixelSize(R.dimen.profile_img_width),
                    resources.getDimensionPixelSize(R.dimen.profile_img_height),
                )
                val options = BitmapFactory.Options()

                options.inSampleSize = calRatio

                var inputStream = contentResolver.openInputStream(it.data!!.data!!)

                val bitmap = BitmapFactory.decodeStream(inputStream,null,options)
                inputStream!!.close()
                inputStream = null

                binding.resultUserImage.setImageBitmap(bitmap)

                Log.d("lhj","갤러리에서 선택된 사진의 크기 비율 calRatio : $calRatio")

            } catch (e: Exception) {
                e.printStackTrace()
                Log.d("lhj", "사진 출력 실패")
            }
        }

        binding.galleryBtn.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI)

            intent.type = "image/*"

            requestGalleryLauncher.launch(intent)
        }

        val requestCameraFileLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            val calRatio = calculateInSampleSize(
                Uri.fromFile(File(filePath)),
                resources.getDimensionPixelSize(R.dimen.profile_img_width),
                resources.getDimensionPixelSize(R.dimen.profile_img_height),
            )
            val options = BitmapFactory.Options()
            options.inSampleSize = calRatio
            val bitmap = BitmapFactory.decodeFile(filePath,options)
            binding.resultUserImage.setImageBitmap(bitmap)
        }

        binding.cameraBtn.setOnClickListener {
            val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val storageDir: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val file = File.createTempFile(
                "JPEG_${timeStamp}_",
                ".jpg",
                storageDir
            )
            filePath = file.absolutePath

            Log.d("lhj", "file.absolutePath : $filePath")

            val photoURI: Uri = FileProvider.getUriForFile(
                this@Lhj0728JoinActivity,
                "com.busanit501.androidlabtest501.fileprovider",
                file
            )

            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)

            requestCameraFileLauncher.launch(intent)
        }
    }

    private fun calculateInSampleSize (fileUri : Uri, reqWidth: Int, reqHeight: Int) :Int {
        val options = BitmapFactory.Options()

        options.inJustDecodeBounds = true

        try {
            var inputStream = contentResolver.openInputStream(fileUri)
            BitmapFactory.decodeStream(inputStream,null,options)
            inputStream!!.close()
            inputStream = null
        } catch (e:Exception) {
            e.printStackTrace()
            Log.d("lhj", "사진 크기 비율 계산 실패")
        }
        val (height : Int, width: Int) = options.run { outHeight to outWidth }
        var inSampleSize = 1
        if (height > reqHeight || width > reqWidth) {

            val halfHeight : Int = height / 2
            val halfWidth : Int = width / 2

            while ( halfHeight / inSampleSize >= reqHeight &&
                halfWidth / inSampleSize >= reqWidth ) {
                inSampleSize *= 2
            }
        }
        return  inSampleSize
    }

}