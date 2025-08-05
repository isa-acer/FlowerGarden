package com.isaacer.cicekbahcem

import android.text.Layout.Directions
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.isaacer.cicekbahcem.databinding.RecyclerRowBinding


class CicekAdapter(val ciceklistem:ArrayList<Cicek>):RecyclerView.Adapter<CicekAdapter.Cicekholder>() {
    //<Cicek> → Senin oluşturduğun data class'ın adı!Bu liste sadece Cicek nesneleri tutabilir
    //String, Int vs. tutamaz


    class Cicekholder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Cicekholder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)


        return Cicekholder (binding)
    }

    override fun getItemCount(): Int {

        return ciceklistem.size
    }

    override fun onBindViewHolder(holder: Cicekholder, position: Int) {

     val cicek=ciceklistem[position]

    holder.itemView.setOnClickListener {
        val action =ilksayfamDirections.actionIlksayfamToSecondFragment(
                // İlk argument Int olmalı (resim)
            cicek.isim,      // İkinci argument String olmalı (isim)
            cicek.aciklama ,
            cicek.resim// Üçüncü argument String olmalı (açıklama)
        )
        Navigation.findNavController(it).navigate(action)
    }


    holder.binding.imageView2.setImageResource(cicek.resim)//resmi koy
    holder.binding.ismitext.text=cicek.isim
    holder.binding.acKlamatextt.text=cicek.aciklama //şimdi bu sayede resmi koydum ismi koydum açıklamayı koydum
        // Bu adapter'ı fragment'te RecyclerView'a bağlamak!
    }

}