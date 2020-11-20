package com.example.latihan.band;

import java.util.ArrayList;

public class AnimeData {
    private static String[] animeName = {
            "ACDC",
            "Aerosmith",
            "The Beatles",
            "Bon Jovi",
            "Foo Fighter",
            "Green Day",
            "Guns n Roses",
            "Queen",
            "Scorpion",
            "Led Zeppelin"
    };

    private static String[] animeDetail ={
            "Band hard rock, AC/DC, dibentuk kakak beradik Angus Young dan Malcolm Young (gitaris) pada 1973.\n" +

                    "Mereka berdua kemudian merekrut Larry Van Kriedt (bassist), Dave Evans (vokal) dan Colin Burgess (drummer). Setelah terkumpul formasi tersebut, mereka berkeliling Australia untuk manggung dari satu tempat ke tempat lainnya.\n" +

                    "Karena tak membuahkan hasil, Young bersaudara kembali merombak personil. Bon Scott menggantikan Dave Evans, Phill Rudd menggantikan Colin dan Mark Evans menggantikan Larry ",


            "Aerosmith adalah kelompok musik rock terkenal dari Amerika Serikat. Walaupun mereka dibentuk di Boston, Massachusetts, tidak ada anggotanya yang berasal dari sana. Tiga anggotanya, Steven Tallarico (Tyler), Joe Perry, dan Tom Hamilton bertemu di Sunapee, New Hampshire di akhir 1960-an namun belum membentuk sebuah band. Tyler berasal dari Yonkers, New York, Perry dari Hopedale, Massachusetts, dan Hamilton dari New London, New Hampshire. Pada 1970, ketiganya memutuskan untuk membentuk band, dan pindah ke Boston, Massachusetts.",


            "The Beatles adalah kelompok pemusik Inggris beraliran rock, dibentuk di Liverpool pada tahun 1960, sering kali dianggap sebagai pemusik tersukses secara komersial dan paling banyak mendapat pujian dalam musik populer. Sejak tahun 1962, kelompok ini terdiri dari John Lennon (gitar ritem, vokal), Paul McCartney (gitar bass, vokal), George Harrison (gitar utama, vokal), Ringo Starr (drum, vokal). Bermula dari aliran skiffle dan rock and roll 1950-an, kelompok ini nantinya memainkan musik dalam berbagai genre mulai dari folk rock sampai rock psikedelik, memasukkan juga unsur musik klasik dan elemen lain dengan cara inovatif.",

            "Bon Jovi adalah band rock Amerika serikat dari Sayreville, New Jersey. Dibentuk pada tahun 1983, Bon Jovi terdiri dari vokalis yang senama 'Jon Bon Jovi' (John Francis Bongiovi, Jr), gitaris Richie Sambora, keyboardist David Bryan, Tico Torres drummer serta bassis saat Hugh McDonald [1]. Personil band ini sebagian besar tetap bertahan sepanjang sejarah mereka, kecuali hengkangnya Alec John Such pada tahun 1994, yang secara tidak resmi digantikan oleh Hugh McDonald, dan keluarnya gitaris dan co-songwriter Richie Sambora tahun 2013. Band ini menjadi terkenal karena menulis beberapa lagu-lagu rock, dan mendapat pengakuan luas dengan album ketiga mereka Slippery When Wet, yang dirilis pada tahun 1986 yang diikuti dengan kesuksesan album keempat, New Jersey pada tahun 1988. Setelah berkeliling dan rekaman non-stop selama 1980-an\n",


            "Foo Fighters adalah band rock berasal dari Seattle, Washington, Amerika Serikat. Dibentuk pada tahun 1994 oleh drummer Nirvana yaitu Dave Grohl setelah kematian Kurt Cobain. Nama band ini terinspirasi dari UFO atau objek-objek terbang misterius yang sering terlihat oleh para pilot pesawat sekutu di Perang Dunia II, yang dikenal secara kolektif sebagai Foo Fighter. Di band ini Grohl sendiri bermain sebagai gitaris dan vokalis.",


            "Green Day adalah band punk rock asal Amerika yang dibentuk pada tahun 1987 di Berkeley, California. Band ini terdiri dari trio Billie Joe Armstrong, Mike Dirnt, dan Tre Cool. Green Day sangat diakui karena keberhasilan mereka dalam membuat genre punk rock kembali terkenal, bersama-sama dengan Sublime, The Offspring, dan Rancid",


            "Guns N' Roses (GNR) adalah kelompok musik hard rock dari Amerika Serikat yang berdiri pada tahun 1984 dan resmi pada Maret tahun 1985 . Anggota pendiri GNR adalah Axl Rose yang merupakan eks vokalis Hollywood Rose dan Tracii Guns yang juga eks gitaris L.A Guns. Grup yang didirikan di Los Angeles, Amerika Serikat ini sempat berganti-ganti personel bahkan gitaris sekaligus pendiri GNR Tracii Guns pun hengkang dari grup ini.",


            "Band QUEEN adalah band rock yang berasal dari Inggris. Band ini dibentuk di London pada tahun 1970  setelah kematian Band Smile, QUEEN terdiri dari vokalis Freddie Mercury, gitaris Brian May, bassist John Deacon dan drummer Roger Taylor.\n" +
                    "Band ini menjadi populer di Masyarakat karena lagu-lagu hits mereka, pertunjukan live, orisinalitas, dan stage performance. Pada tahun 1985 pertunjukan Live Aid mereka terpilih sebagai rock live terbaik sepanjang masa oleh sesama seniman, wartawan dan para eksekutif industri musik dalam jajak pendapat industri musik tahun 2005.",


            "Scorpions adalah band rock Jerman yang berasal dari kota Hanover. Dibentuk pada tahun 1965. Sejak awal band ini, gaya musik mereka telah berkisar dari hard rock hingga heavy metal. Salah satu anggota awal band ini adalah sang gitaris Rudolf Schenker, meskipun Klaus Meine adalah vokalis untuk semua album mereka. ",

            "Led Zeppelin adalah kelompok musik rock dari Inggris yang dibentuk bulan September 1968, dan dibubarkan setelah pemain drum John Bonham meninggal. Led Zeppelin terdiri dari Jimmy Page, Robert Plant, John Paul Jones, dan John Bonham. Dengan musiknya yang menonjolkan suara gitar yang keras dan berat"
    };

    private static int[] animeImages = {
            R.drawable.acdc,
            R.drawable.aerosmith,
            R.drawable.beatles,
            R.drawable.bonjovi,
            R.drawable.foo,
            R.drawable.greenday,
            R.drawable.gunsroses,
            R.drawable.queen,
            R.drawable.scorpion,
            R.drawable.zeppelin
    };

    static ArrayList<Anime> getListData(){
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < animeName.length;position++){
            Anime anime = new Anime();
            anime.setName(animeName[position]);
            anime.setDetail(animeDetail[position]);
            anime.setPhoto(animeImages[position]);
            list.add(anime);
        }
        return list;
    }

}

