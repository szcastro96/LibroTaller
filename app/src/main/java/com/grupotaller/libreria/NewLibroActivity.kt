package com.grupotaller.libreria

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import androidx.recyclerview.widget.RecyclerView
import com.grupotaller.libreria.Entity.Libro

class NewLibroActivity : AppCompatActivity() {

    private lateinit var newID : EditText
    private lateinit var newTitulo : EditText
    private lateinit var newAutor : EditText
    private lateinit var newTag : EditText
    private lateinit var newResumen : EditText

    private lateinit var btnAdd : Button

    private lateinit var showid : TextView
    private lateinit var showTitulo : TextView
    private lateinit var showAutor : TextView
    private lateinit var showTag : TextView
    private lateinit var showResumen : TextView

    private lateinit var editLibroView : EditText
    private lateinit var BookViewModel: AndroidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_libro)
        //editLibroView = findViewById(R.id.edit_libro)

        newID = findViewById(R.id.et_id_newlibro)
        newTitulo = findViewById(R.id.et_titulo_newlibro)
        newAutor = findViewById(R.id.et_autor_newlibro)
        newTag = findViewById(R.id.et_tag_newlibro)
        newResumen = findViewById(R.id.et_resumen_newlibro)

        showid = findViewById(R.id.tv_id)
        showTitulo = findViewById(R.id.tv_titulo)
        showAutor = findViewById(R.id.tv_autor)
        showTag = findViewById(R.id.tv_tag)
        showResumen = findViewById(R.id.tv_resumen)

        btnAdd = findViewById(R.id.button_save)


        btnAdd.setOnClickListener {
            val libroNuevo = Libro(0,newTitulo.toString(),0,newAutor.toString(),newTag.toString(),newResumen.toString(),false)
        }

        class CustomViewHolder(val view : View): RecyclerView.ViewHolder(view){

            init {
                val intent = Intent(view.context, MainActivity::class.java)

                view.context.startActivity(intent)
            }
        }}

    companion object {
        const val EXTRA_REPLY ="com.example.android.librolistsql.REPLY"
    }
}
