package com.isaacer.cicekbahcem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.isaacer.cicekbahcem.databinding.FragmentIlksayfamBinding


class ilksayfam : Fragment() {
    private var _binding: FragmentIlksayfamBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIlksayfamBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {//View'lara güvenli şekilde erişebileceğin yer burası
        super.onViewCreated(view, savedInstanceState)
        val cicekListem= arrayListOf(
            Cicek("gül","Gül, gülgiller  familyasının Rosa cinsinden, odunsu çok yıllık kapalı tohumlu güzel kokulu bitki türlerine verilen ad. ",R.drawable.gul),
            Cicek("menekse","Menekşe, menekşegiller (Violaceae) familyasına bağlı Viola cinsini oluşturan çoğunlukla saksılarda yetiştirilen bitki türlerinin ortak adı",R.drawable.menekse),
            Cicek("papatya","Papatya, papatyagiller (Asteraceae) familyasında sınm gibi farklı cinslerdendie",R.drawable.papatya),
            Cicek("aslan","Sinirotugiller familyasına ait, genellikle yarı çalı formunda, çok yıllık bir bitkidir.",R.drawable.aslan),
            Cicek("lale","Lale, zambakgiller familyasından Tulipa cinsini oluşturan güzel çiçekleri ile süs bitkisidir.",R.drawable.lale),
            Cicek("gelincik","Gelincik (Papaver rhoeas), gelincikgiller (Papaveraceae) familyasından Dünya'da çok geniş bir yayılma alanına sahip bir yıllık bir bitki türü..",R.drawable.gelincik),
        )// listemi oluşturdum bu listemi recyclerviwa verecem orada gösterilecek.

        // şimdi adapteri oluşturalım

        //Bu olmadan RecyclerView nasıl dizileceğini bilmez (dikey mi, yatay mı vs.)
        binding.Recyclerview.layoutManager=LinearLayoutManager(requireContext())
        val adapter=CicekAdapter(cicekListem)// yukarıda oluşturduğum ciceklistemi adaptere veriorum
        binding.Recyclerview.adapter = adapter







    }


}