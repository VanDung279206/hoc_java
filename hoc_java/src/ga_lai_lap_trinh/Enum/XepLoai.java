package ga_lai_lap_trinh.Enum;

public enum XepLoai {
    gioi("Xếp Loại giỏi"),   //0
    kha("Xếp Loại khá"),    //1
    tb("Xếp Loại trung bình"),     //2
    yeu("Xếp Loại yếu"),    //3
    duoihoc("đuổi học"); //4
    private String msg;

    XepLoai(String msg) {
        this.msg = msg;
    }

    public String des() {
        return this.msg;
    }
}
