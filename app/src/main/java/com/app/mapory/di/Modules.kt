package com.app.mapory.di

import com.app.mapory.repo.AddLocationScreenRepo
import com.app.mapory.repo.LocationDetailsScreenRepo
import com.app.mapory.repo.LoginScreenRepo
import com.app.mapory.repo.MapsScreenRepo
import com.app.mapory.repo.ProfileScreenRepo
import com.app.mapory.repo.RecentScreenRepo
import com.app.mapory.repo.RegisterScreenRepo
import com.app.mapory.viewmodel.AddLocationScreenViewModel
import com.app.mapory.viewmodel.LocationDetailsScreenViewModel
import com.app.mapory.viewmodel.LoginScreenViewModel
import com.app.mapory.viewmodel.MapsScreenViewModel
import com.app.mapory.viewmodel.ProfileScreenViewModel
import com.app.mapory.viewmodel.RecentScreenViewModel
import com.app.mapory.viewmodel.RegisterScreenViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object Modules {

    val firebaseModule = module {
        single { FirebaseAuth.getInstance() }
        single { FirebaseFirestore.getInstance() }
        single { FirebaseStorage.getInstance() }
    }

    val repositoryModule = module {
        single { MapsScreenRepo() }
        single { AddLocationScreenRepo() }
        single { LoginScreenRepo() }
        single { RegisterScreenRepo() }
        single { LocationDetailsScreenRepo() }
        single { RecentScreenRepo() }
        single { ProfileScreenRepo() }
    }

    val viewModelModule = module {
        viewModel {
            LoginScreenViewModel(
                get(),get(),get()
            )
        }

        viewModel {
            RegisterScreenViewModel(
                get(),get(),get()

            )
        }

        viewModel {
            AddLocationScreenViewModel(
                get(),get(),get(),get(),get()

            )
        }

        viewModel {
            MapsScreenViewModel(
                get(),get(),get(),get()
            )
        }

        viewModel {
            LocationDetailsScreenViewModel(
                get(),get(),get(),get()
            )
        }

        viewModel {
            RecentScreenViewModel(
                get(),get(),get()
            )
        }

        viewModel {
            ProfileScreenViewModel(
                get(),get(),get(),get()
            )
        }


    }
}



/**
 * 1- Medya kısmındaki notlar çalışmıyor. Not ekleniyor ama okunmuyor.2- Medya kısmında ses kaydedince ya da yükleyince,
 * kare biçimde gözükmesi güzel ama dinlemeye çalışınca siyah bir video izler gibi olması yerine spotify gibi aşağıda gözüken
 * durdurma oynatma ve süreyi gösteren bir alan açılabilir. (Ya da farklı bir şekilde de açılabilir, sadece ses dinlenen bir olay şeklinde)
 * 3- Detay sayfasında fotoğraf için yapmaya çalıştığımız işlemleri video için de yapabilir miyiz? (Sağa sola kaydırma ve kaydırarak kapatma
 * işlemi sadece, videoda büyütmeye gerek yok) Videonun sadece durdurulup devam ettirilmesi yeterli. 5 saniye geri-ileri alma, video
 * sonuna-başına gitme işlemlerine gerek yok. (Hem yeni video ekleme hem detay sayfasındaki video için)
 * 5- Medya işlemlerinde video eklerken önizlemede video görseli gözüküyor, bunu detay sayfası için de yapabilir miyiz.
 * 4- Haritada gösterilen rastgele anıları ayarlamak için:
 * -Yeni anı kaydedince yeni anıyı
 * -Bunun dışında mevcut konumumuzu gösterebilir (Konuma izin verilmeyen durumlarda son anı olabilir)
 *
 *
 *
 *
 *
 *
 * **/





