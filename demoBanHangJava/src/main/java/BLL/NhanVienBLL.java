package BLL;

import DAL.NhanVienDAL;

public class NhanVienBLL {
    NhanVienDAL nvDAL;
    public boolean ThemMoi(NhanVienDAL nv){
        boolean kq = nvDAL.AddNew(nv);
        return kq;
    }
    public boolean checkLogin(String tenDN, String matkhau){
        return nvDAL.Login(tenDN, matkhau);
    }
}


