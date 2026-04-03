package delegation


// lazy - 지연 초기화

class Image {
    init {
        println("생성되기까지 오래 걸림 (진짜임)")
    }

    fun metadata() = println("date: 2025-04-03 ...")
}

class ImageViewer {
    init {
        println("객체 생성중...")
    }
    val image: Image by lazy {
        println("Image loading...")
        Image()
    }

    fun info() = println("ImageViewer ver.2.3.0")

}

fun main() {
    val imageViewer = ImageViewer()
    imageViewer.info()
    imageViewer.image.metadata()

}