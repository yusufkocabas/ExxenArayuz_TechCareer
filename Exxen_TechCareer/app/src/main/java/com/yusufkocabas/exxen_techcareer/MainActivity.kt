package com.yusufkocabas.exxen_techcareer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusufkocabas.exxen_techcareer.adapter.BolumRecycleAdapter
import com.yusufkocabas.exxen_techcareer.databinding.ActivityMainBinding
import com.yusufkocabas.exxen_techcareer.model.Bolum

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bolumList:ArrayList<Bolum>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        fillAllEpisodes()
        setContentView(view)
        binding.episodeRecyclerView.isNestedScrollingEnabled = false;
        binding.episodeRecyclerView.setHasFixedSize(false)
        binding.episodeRecyclerView.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.episodeRecyclerView.adapter=BolumRecycleAdapter(bolumList,this);
    }

    private fun fillAllEpisodes() {
        bolumList= ArrayList()
        bolumList.add(Bolum("10. Bölüm - (31.03.23)",58,"bolum10"))
        bolumList.add(Bolum("9. Bölüm -  (24.03.23)",46,"bolum9"))
        bolumList.add(Bolum("8. Bölüm -  (17.03.23)",50,"bolum8"))
        bolumList.add(Bolum("7. Bölüm -  (10.03.23)",52,"bolum7"))
        bolumList.add(Bolum("6. Bölüm -  (03.03.23)",58,"bolum6"))
        bolumList.add(Bolum("5. Bölüm -  (03.02.23)",54,"bolum5"))
    }
}