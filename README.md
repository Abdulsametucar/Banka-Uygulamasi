# 💳 Nesneye Yönelik Banka Uygulaması (Java)

Bu proje, **Nesneye Yönelik Programlama** dersi kapsamında geliştirilmiş bir **Java tabanlı banka uygulamasıdır**. Temel hedef; sınıf yapısı, kalıtım, polimorfizm ve kapsülleme gibi OOP ilkelerini kullanarak gerçek dünya problemini modellemektir.

---

## 🎯 Projenin Amacı

Bu projede; kullanıcıların banka personeli veya müşteri olarak sisteme dahil olabileceği, hesap açma/silme, kredi kartı işlemleri gibi temel banka faaliyetlerinin gerçekleştirilebildiği bir nesne yönelimli yapı kurulmuştur.

---

## ⚙️ Teknolojiler

- **Dil:** Java
- **Editör:** Eclipse
- **OOP Kavramları:** Inheritance, Polymorphism, Encapsulation
- **Yapılar:** ArrayList, Random, Constructor Overloading

---

## 🧱 Sınıf Yapısı

### 🧍‍♂️ `Kisi`
- Temel kullanıcı sınıfı (ad, soyad, email, telefon, T.C. no vb.)
- Müşteri ya da personel rolüne göre ayrım yapılır
- Kredi kartı ile ilişkili işlemler burada tanımlanır

### 🧍‍♀️ `Musteri` (extends Kisi)
- Hesap ekleme, silme işlemleri
- Hesap türü (Vadeli/Vadesiz/Yatırım)
- Kredi kartı ekleme, silme, borç ödeme işlemleri

### 👨‍💼 `Personel` (extends Kisi)
- Müşteri bilgileri üzerinde işlem yetkisi
- Mevcut müşteriye yeni hesap ekleme ya da hesabını silme yetkisi

### 🏦 `BankaHesap`
- Hesap bilgisi, türü, IBAN, açılış tarihi
- Alt sınıflar:
  - `VadeliHesap` → faiz oranına göre bakiye artışı
  - `VadesizHesap` → kesinti tutarları belirlenir
  - `YatirimHesap` → döviz veya altın üzerinden yatırım işlemleri

### 💳 `KrediKarti`
- Kart numarası, limit, güncel borç
- Kredi teklifi ve borç yönetimi

---

## 🔄 Uygulama Akışı

1. **Kisi Oluşturma:**
   - Kullanıcıdan ad, soyad, email, telefon alınır
   - Rastgele 11 haneli T.C. kimlik numarası atanır

2. **Rol Seçimi:**
   - Personel mi, müşteri mi olduğunu belirtir
   - `Personel` ise müşteri bilgileri üzerinden işlem yapılır
   - `Musteri` ise hesap/kredi işlemleri yapılır

3. **Hesap İşlemleri:**
   - **Vadeli Hesap:**
     - Maaş hesabıysa %20 faiz, normal hesabıysa %10 faiz
   - **Vadesiz Hesap:**
     - Maaş hesabıysa 0 TL kesinti, normal hesabıysa 8 TL kesinti
   - **Yatırım Hesabı:**
     - Döviz (kur=10) veya altın (kur=20) ile işlem yapılır

4. **Kredi Kartı İşlemleri:**
   - Limit 5000 TL altındaysa güncel borç gösterilir
   - Limit 10000 TL üstüyse kullanıcıya kredi kampanyası sunulur
   - Borç ödeme işlemi yapılabilir
   - Borç sıfırsa kart silinebilir

---

## 🛠️ Kurulum ve Çalıştırma

```bash
# Eclipse veya başka bir IDE ile:
1. Yeni Java projesi oluşturun
2. Tüm .java dosyalarını src klasörüne ekleyin
3. MainBank sınıfından çalıştırın

```
## 🔁 Yapılan Değişiklikler
public Kisi(){} eklendi (parametresiz yapılandırıcı)

limit, kartNumara, guncelBorc gibi değişkenler Kisi sınıfına taşındı

krediKartiBorcOdeme metodu KrediKarti sınıfına alındı (void olarak)

ArrayList kullanımı ve geçişler parametrik hale getirildi

Kredi teklifleri ve borç güncellemeleri detaylandırıldı

## 📝 Ek Bilgi
Rastgele değer üretimi (Random) kullanılmıştır

Kredi ve hesap işlemlerinde polimorfizm uygulanmıştır

Kod tamamen nesne yönelimli prensiplere göre yazılmıştır

## 👤 Geliştirici
Abdulsamet Uçar
