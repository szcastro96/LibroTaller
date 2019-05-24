package com.grupotaller.libreria.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.grupotaller.libreria.DAO.LibroDAO
import com.grupotaller.libreria.Entity.Libro

class LibroRepository(val librodao: LibroDAO) {

    var allLibros: LiveData<List<Libro>> = librodao.getAll();

    @WorkerThread
    suspend fun insert(libro: Libro) {
        librodao.Insert(libro);
    }

    @WorkerThread
    suspend fun deleteAll() {
        librodao.deleteAll();
    }

    fun search(nombre: String): LiveData<List<Libro>> {
        return librodao.getSearch(nombre);
    }

    fun getFavoritos(): LiveData<List<Libro>> {
        return librodao.getFavorito();
    }

    fun getAll(): LiveData<List<Libro>> {
        return librodao.getAll();
    }
}
