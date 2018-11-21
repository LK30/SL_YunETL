package sl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection = "z_book_lend_sys")
public class BookLend {
    @Id
    private String _id;
    @Field("id")
    long id;
    @Field("account")
    String account;
    @Field("operation_time")
    String operation_time;
    @Field("year")
    int year;
    @Field("month")
    int month;
    @Field("day")
    int day;
    @Field("hour")
    int hour;
    @Field("operation")
    String operation;
    @Field("book_name")
    String book_name;
    @Field("book_no")
    String book_no;
    @Field("book_category")
    String book_category;
    @Field("book_macrc_no")
    String book_marc_no;
    @Field("book_author")
    String book_author;
    @Field("book_publisher")
    String book_publisher;
    @Field("book_pubyear")
    String book_pubyear;
    @Field("reader_name")
    String reader_name;
    @Field("reader_school")
    String reader_school;
    @Field("reader_academy")
    String reader_academy;
    @Field("reader_major")
    String reader_major;
    @Field("reader_grade")
    String reader_grade;
    @Field("reader_gender")
    String reader_gender;
    @Field("reader_identity")
    String reader_identity;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOperation_time() {
        return operation_time;
    }

    public void setOperation_time(String operation_time) {
        this.operation_time = operation_time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

    public String getBook_category() {
        return book_category;
    }

    public void setBook_category(String book_category) {
        this.book_category = book_category;
    }

    public String getBook_marc_no() {
        return book_marc_no;
    }

    public void setBook_marc_no(String book_marc_no) {
        this.book_marc_no = book_marc_no;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public String getBook_pubyear() {
        return book_pubyear;
    }

    public void setBook_pubyear(String book_pubyear) {
        this.book_pubyear = book_pubyear;
    }

    public String getReader_name() {
        return reader_name;
    }

    public void setReader_name(String reader_name) {
        this.reader_name = reader_name;
    }

    public String getReader_school() {
        return reader_school;
    }

    public void setReader_school(String reader_school) {
        this.reader_school = reader_school;
    }

    public String getReader_academy() {
        return reader_academy;
    }

    public void setReader_academy(String reader_academy) {
        this.reader_academy = reader_academy;
    }

    public String getReader_major() {
        return reader_major;
    }

    public void setReader_major(String reader_major) {
        this.reader_major = reader_major;
    }

    public String getReader_grade() {
        return reader_grade;
    }

    public void setReader_grade(String reader_grade) {
        this.reader_grade = reader_grade;
    }

    public String getReader_gender() {
        return reader_gender;
    }

    public void setReader_gender(String reader_gender) {
        this.reader_gender = reader_gender;
    }

    public String getReader_identity() {
        return reader_identity;
    }

    public void setReader_identity(String reader_identity) {
        this.reader_identity = reader_identity;
    }
}
