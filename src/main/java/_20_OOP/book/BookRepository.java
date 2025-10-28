package _20_OOP.book;

// repository 역할: DB와 연결 관리 
// DB 에서 데이터를 불러오는 역할
public class BookRepository {
    Book[] books; // book들을 저장할 배열(DB대용)

    // 생성자를 통해서 의존하는 객체를 주입 -> 의존성 주입
    public BookRepository(Book[] books) {
        this.books = books;
    }
    
    // 아래의 메서드들은 차후에 sql쿼리가 되어야 한다.
    // sql쿼리: database 언어

    // 도서를 배열에 저장하는 메서드
    void insert(Book book) {
        // 비어있는 인덱스를 모름.
        int emptyIndex = getEmptyIndex();
        if (emptyIndex == -1) {
            System.out.println("현재 저장할 공간이 없습니다.");
            return;
        }
        books[emptyIndex] = book;
        System.out.println(book.toString() + "저장 완료");
    }

    // null ? 참조자료형에만 있는 값
    // 참조자료형 변수에 heap 주소가 저장되어야 하는데,
    // 주소가 없는 경우가 있음(초기화가 안된 것)
    // 저장된 주소가 없습니다를 표현하는 값.
    // NullPointerException -> 참조자료형은 .으로 참조할 수 있는데
    // 초기화가 안되면 null을 참조하게되어서 예외가 발생한다.
    int getEmptyIndex() {
        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) { // books의 i번째가 비어있으면
                return i; // 해당 index를 반환
            }
        }
        return -1; // 0을 포함한 양수가 아닌경우
    }

    // 등록된 도서들을 조회
    // 배열에 5칸을 만들어놨는데, 만약 2권만 등록됬다면?
    // 배열의 길이만큼 순회하면 에러가 발생할 수 있음!
    // 5칸중에 실제 등록된 도서만 모아서 새로운 배열을 반환
    Book[] getBookDatas() {
        int count = 0;
        // 1. null이 아닌 도서의 갯수를 센다(count 활용)
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            }
        }
        // 2. new Book[count]
        Book[] newBooks = new Book[count];

        // 3. 등록된 도서만 복사
        int j = 0; // newBooks의 index
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                newBooks[j] = books[i];
                // j는 복사를 할때마다, 1씩증가(다음칸으로)
                j++;
            }
        }

        return newBooks;
    }

    
}
