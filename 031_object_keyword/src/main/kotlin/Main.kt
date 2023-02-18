data class Book (var name : String, var price : Int)

object BookShelf
{
    var books = arrayListOf<Book>()

    fun showBooks()
    {
        for(i in books)
        {
            println(i)
        }
    }
}

fun main(args: Array<String>)
{
    BookShelf.books.add(Book("Java",50))
    BookShelf.books.add(Book("Sql",40))
    BookShelf.books.add(Book("Kotlin",80))

    BookShelf.showBooks()

}