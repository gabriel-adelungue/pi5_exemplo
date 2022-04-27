package br.senac.pi.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.senac.pi.R
import br.senac.pi.databinding.ActivityDesafioBinding
import br.senac.pi.fragments.PlaylistFragment
import br.senac.pi.fragments.RecentsFragment

class DesafioActivity : AppCompatActivity() {
    lateinit var binding: ActivityDesafioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesafioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when(item.itemId) {
            R.id.playlist -> {
                val frag = PlaylistFragment()
                supportFragmentManager.beginTransaction().replace(R.id.containerDesafio, frag).commit()
            } else -> {
                val frag = RecentsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.containerDesafio, frag).commit()
            }
        }


        return super.onOptionsItemSelected(item)
    }

}