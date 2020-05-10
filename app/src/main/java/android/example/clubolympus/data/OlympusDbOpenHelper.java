package android.example.clubolympus.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.example.clubolympus.data.ClubOlympusContract.MemberEntry;

public class OlympusDbOpenHelper extends SQLiteOpenHelper {
    public OlympusDbOpenHelper(Context context) {
        super(context, ClubOlympusContract.DATABASE_NAME,
                null, ClubOlympusContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MEMBERS_TABLE = "CREATE TABLE " + MemberEntry.TABLE_NAME + "("
                + MemberEntry._ID + " INTEGER PRIMARY KEY,"
                + MemberEntry.COLUMN_FIRST_NAME + " TEXT,"
                + MemberEntry.COLUMN_LAST_NAME + " TEXT,"
                + MemberEntry.COLUMN_GENDER + " INTEGER NOT NULL,"
                + MemberEntry.COLUMN_SPORT + " TEXT" + ")";

        db.execSQL(CREATE_MEMBERS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ClubOlympusContract.DATABASE_NAME);
        onCreate(db);
    }

    //CRUD
    //Create, Read, Update, Delete

//    public void addCar(Car car){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(Util.KEY_NAME, car.getName());
//        contentValues.put(Util.KEY_PRICE, car.getPrice());
//        db.insert(Util.TABLE_NAME, null, contentValues);
//        db.close();
//    }
//
//    public Car getCar(int id){
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.query(Util.TABLE_NAME, new String[] {Util.KEY_ID, Util.KEY_NAME,
//                        Util.KEY_PRICE}, Util.KEY_ID + "=?", new String []{String.valueOf(id)},
//                null, null,
//                null,null);
//        if(cursor != null){
//            cursor.moveToFirst();
//        }
//
//        Car car = new Car (Integer.parseInt(cursor.getString(0)),
//                cursor.getString(1), cursor.getString(2));
//        return car;
//    }
//
//    public List<Car> getAllCars() {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        List<Car> carsList = new ArrayList<>();
//
//        String selectAllCars = "SELECT * FROM " + Util.TABLE_NAME;
//        Cursor cursor = db.rawQuery(selectAllCars, null);
//        if (cursor.moveToFirst()) {
//            do {
//                Car car = new Car();
//                car.setId(Integer.parseInt(cursor.getString(0)));
//                car.setName(cursor.getString(1));
//                car.setPrice(cursor.getString(2));
//
//                carsList.add(car);
//            } while (cursor.moveToNext());
//        }
//        return carsList;
//
//    }
//
//    public int updateCar(Car car) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(Util.KEY_NAME, car.getName());
//        contentValues.put(Util.KEY_PRICE, car.getPrice());
//
//        return db.update(Util.TABLE_NAME, contentValues, Util.KEY_ID + "=?",
//                new String[] {String.valueOf(car.getId())});
//    }
//    public void deleteCar(Car car) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(Util.TABLE_NAME, Util.KEY_ID + "=?",
//                new String[] {String.valueOf(car.getId())});
//        db.close();
//    }
//
//    public int getCarsCount() {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        String countQuery = "SELECT * FROM " + Util.TABLE_NAME;
//        Cursor cursor = db.rawQuery(countQuery, null);
//        return cursor.getCount();
//
//    }
}

