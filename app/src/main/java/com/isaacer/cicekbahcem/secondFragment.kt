package com.isaacer.cicekbahcem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isaacer.cicekbahcem.databinding.FragmentIlksayfamBinding
import com.isaacer.cicekbahcem.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //şimdi burada ilk fragmentten gelen bilgileri alıcam
        //// Gönderilen bilgileri al
        val adapterdengönderilenbilgilerial=secondFragmentArgs.fromBundle(requireArguments())
        val cicekismi=adapterdengönderilenbilgilerial.isim
        val resim=adapterdengönderilenbilgilerial.image

         val detayliaciklama=when(cicekismi){
             "gül" ->"Gül, gülgiller (Rosaceae) familyasının Rosa cinsinden, odunsu çok yıllık kapalı tohumlu güzel kokulu bitki türlerine verilen ad.[1]\n" +
                     "\n" +
                     "Çoğu gül türünün ana vatanı Asya'dır. Daha az sayıda türleri Avrupa, Kuzey Amerika ve Kuzeybatı Afrika'da yetişir. Güller yaygın olarak güzellikleri ve kokuları için yetiştirilir ve birçok toplumda kültürel öneme sahiptir.[1] Park ve bahçelerin süslenmesinde kullanıldığı gibi odaları, balkon ve terasları süsler. Birçok rengi vardır. Kesme çiçekçilikte çok talep edilen bir çiçektir."
             "menekse" ->"Menekşe, menekşegiller (Violaceae) familyasına bağlı Viola cinsini oluşturan çoğunlukla saksılarda yetiştirilen bitki türlerinin ortak adı. 400 ile 500 arası türü bulunmaktadır. Dünyanın birçok yerinde yetişebilmekle beraber en çok kuzey yarımkürede yetişir. Ayrıca Hawai ve Güneydoğu Asya'da da yetişebilir. Doğada aydınlık, fakat gölgede ve nemli bölgelerde yetişir.\n" +
                     "\n" +
                     "Özellikler\n" +
                     "Genellikle uzun ömürlü olabilen menekşe türü, bazen dönemlik de yaşayabilir. Yaprakları kalp şeklini andırır ve düzensiz, asimetrik (çarpık) çiçekleri bulunur. Bu çiçekleri menekşe familyasının içindeki türlerin ayırt edici özelliğidir. Çiçeklerinin rengi genellikle, çiçeğin adını verdiği menekşe rengindedir. Fakat mavi, sarı, beyaz, pembe ya da çok renkli açan türleri de bulunur. Çok bol çiçek açar, tüm bahar ve yaz döneminde çiçek açtığı görülebilir."
             "papatya" -> "Papatyanın spazm çözülmesinde, gaz ve âdet sancılarının giderilmesinde faydalı olduğu ifade edilmektedir. Papatyada bulunan Alfa bisabolol maddesi ülsere iyi gelmektedir; Azulene ise mide yanmasına karşı etkilidir.[1] Gastrit ve ülseratif kolit tedavisinde kullanılır. Ayrıca ağız iltihaplarını iyileştirir.[2]\n" +
                     "\n" +
                     "Zehirlenme; Ege Üniversitesi Eczacılık Fakültesi Farmakognozi Anabilim Dalı Başkanı Prof. Dr. Bijen Kıvçak'ın ifadelerine göre papatya çayının ilaçlarla etkileşimi bulunmakta ve papatyaların bazı türleri ciddi zehirlenmelere yol açabilmektedir. Ayrıca Papatya Türkiye'de zehir danışma merkezlerine gelen vakaların başında gelir ve bazı türleri böcek ilacı yapımında kullanılmaktadır.\n" +
                     "\n" +
                     "Klinik ortamda tekrarlanmamış, sadece hayvanlar üzerinde yapılan çalışmalar, papatyaların belirli gastrointestinal hastalık risklerini azaltarak, daha sağlıklı bir sindirime yardımcı olduğunu öne sürmektedir. Örneğin; fareler üzerinde yapılan birkaç çalışmada, papatya özütünün ishale karşı koruma potansiyeline sahip olduğu bulunmuştur. Bu yararın, papatyanın sahip olduğu antienflamatuar özelliklerden kaynaklandığı düşünülmektedir. Sıçanlarda yapılan bir başka çalışmada ise, papatya mide ülserlerini önlemeye yardım etmede etkili bulmuştur. Papatya mide asitliğini azaltarak, ülser gelişimine katkıda bulunan bakterilerin büyümesini engelleyebilir. Bu bulgulara rağmen, papatyanın sindirim sistemindeki rolünü doğrulamak için daha fazla klinik araştırmaya ihtiyaç vardır.[3]"
             "aslan" -> "Bitkilerin yapraklarından beslenen böcekler özellikle yaprak yiyenler, türe zarar verenler arasındadır. Türün büyümesini engelleyici ve yaprak altlarındaki sıvıları tükettikleri için yapraklarda kahverengimsi kenarlı sarı noktalar bırakırlar.[6] Böcekler arasında türe en zarar vereni Frankliniella occidentalisdir.[7]\n" +
                     "\n" +
                     "Böceklerin yanı sıra Colletotrichum[6], Botrytis cinerea[6], Pythium[7], Oidium[1] ve Puccinia antirrhini[1] gibi mantarlar da türün zararlıları arasındadır."
             "lale" -> "Lale (Tulipa), zambakgiller (Liliaceae) familyasından Tulipa cinsini oluşturan güzel çiçekleri ile süs bitkisi olarak yetiştirilen, soğanlı, çok yıllık otsu bitki türlerinin ortak adı.\n" +
                     "\n" +
                     "Anavatanı Pamir, Hindukuş ve Tanrı dağlarıdır.[1] Türkler göçleri esnasında bu bitkinin soğanlarını Anadolu'ya getirmiştir. 1500'lü yıllarda Avrupa'ya Anadolu'dan giden lale özellikle Hollanda'da çok yaygındır. Soğanlarının üzerinde zarımsı bir örtü bulunur. Etli ve yeşil 2-8 yaprağı vardır. Çiçekler, saplar ucunda çoğunlukla bir, bazen ikidir.Kırmızı, sarı ve ara tonlarda renklere sahiptir.\n" +
                     "\n" +
                     "16. yüzyılda Kanuni Sultan Süleyman tarafından Hollanda Kralı'na gönderilen laleler, ilk başta Hollandalıları ve kısa zaman içerisinde tüm Avrupalıları hayranlık içinde bırakmışlardır. Böylece günümüze kadar dünyanın en fazla lale üreten ülkesi Hollanda olmuştur."
             "gelincik" -> "Gelincik (Papaver rhoeas), gelincikgiller (Papaveraceae) familyasından Dünya'da çok geniş bir yayılma alanına sahip bir yıllık bir bitki türü.\n" +
                     "\n" +
                     "Morfolojik özellikleri\n" +
                     "\n" +
                     "Gelincik çiçeklerin bir arada görülmesi\n" +
                     "25–60 cm arasında değişen yüksekliklere ulaşabilir. Yaprakları mavimsi yeşildir. Dip yapraklar uzun saplı, gövde yaprakları sapsız ve gövdeye bitişiktir.\n" +
                     "\n" +
                     "Çiçeklerin genel rengi koyu kırmızıdır. Ancak beyaza kadar giden sarı, turuncu gibi değişik renkleri vardır.\n" +
                     "\n" +
                     "Gelincik Temmuz ile Ağustos aylarında sabah saat beş buçuk ile on saatleri arasında tohum tozlarını (polen) yayar. Aynı saatlerde arılar ve diğer böcekler çiçeklere gelerek bu tozlara bulanırlar. Böylece, böceklerin beslenme saatleri ile bitkilerin tohum tozlarını yayma saatleri aynı zaman dilimine rastlamaktadır."

             else ->  "çicek yoktur"

         }
        binding
        binding.imageView.setImageResource(resim)
        binding.textView3.text =detayliaciklama

    }
}