package com.yusufkocabas.exxen_techcareer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yusufkocabas.exxen_techcareer.databinding.SingleEpisodeItemBinding
import com.yusufkocabas.exxen_techcareer.model.Bolum

class BolumRecycleAdapter(private var episodeList: List<Bolum>, var mContext: Context) :
    RecyclerView.Adapter<BolumRecycleAdapter.EpisodeViewHolder>() {

    inner class EpisodeViewHolder(private var view: SingleEpisodeItemBinding) : RecyclerView.ViewHolder(view.root) {
        fun bindView(episode: Bolum) {
            view.bolumBilgisi.text = buildString {
                append(episode.duration)
                append("m")
            }
            view.kacincibolum.text = episode.title
            val image =
                mContext.resources.getIdentifier(episode.image, "drawable", mContext.packageName)
            view.episodeImageView.setImageResource(image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val inflater = LayoutInflater.from(mContext)
        val view = SingleEpisodeItemBinding.inflate(inflater, parent, false)
        return EpisodeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return episodeList.size
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bindView(episodeList[position])
    }
}