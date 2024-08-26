# a. MaHS, HoTenHS, GioiTinh, MaLop, TenLop, NamHoc, MaGVCN, HoTenGV (chủ nhiệm) của học sinh trong trường.
    SELECT ma_hs, gioi_tinh, lop.ma_lop, lop.ten_lop, lop.nam_hoc, lop.ma_gvcn, gv.ho_ten_gv
    FROM hoc_sinh
    INNER JOIN lop ON hoc_sinh.ma_lop = lop.ma_lop
    INNER JOIN giao_vien gv ON lop.ma_gvcn = gv.ma_gv;

# b. MaHS, HoTenHS, HocKy, MaMH, TenMH, DiemThiGiuaKy, DiemThiCuoiKy của học sinh và các môn học đã có kết quả tương ứng với từng học sinh trong trường.
    SELECT kq.ma_hs, hs.ho_ten_hs, kq.hoc_ky, kq.ma_mh, mh.ten_mh, kq.diem_thi_giua_ky, kq.diem_thi_cuoi_ky
    FROM ket_qua_hoc_tap kq
    INNER JOIN hoc_sinh hs ON kq.ma_hs = hs.ma_hs
    INNER JOIN mon_hoc mh ON kq.ma_mh = mh.ma_mh;

# c. MaHS, HoTenHS, HocKy, MaMH, TenMH, DiemThiGiuaKy, DiemThiCuoiKy, MaLop, MaGV (phụ trách), HoTenGV (phụ trách) của học sinh và các môn học đã có kết quả tương ứng với từng học sinh trong trường.
    SELECT kq.ma_hs, hs.ho_ten_hs, kq.hoc_ky, kq.ma_mh, mh.ten_mh, kq.diem_thi_giua_ky, kq.diem_thi_cuoi_ky,
           hs.ma_lop, lop.ma_gvcn, gv.ho_ten_gv
    FROM ket_qua_hoc_tap kq
    INNER JOIN hoc_sinh hs ON kq.ma_hs = hs.ma_hs
    INNER JOIN mon_hoc mh ON kq.ma_mh = mh.ma_mh
    INNER JOIN lop ON hs.ma_lop = lop.ma_lop
    INNER JOIN giao_vien gv ON lop.ma_gvcn = gv.ma_gv;

# d. MaHS, HoTenHS, MaLop, MaGVCN, HoTenGV (chủ nhiệm), HocKy, MaMH, TenMH, DiemThiGiuaKy, DiemThiCuoiKy, MaGV (phụ trách), HoTenGV (phụ trách) của học sinh và các môn học đã có kết quả tương ứng với từng học sinh trong trường.
    SELECT *
    FROM hoc_sinh
    INNER JOIN lop ON hoc_sinh.ma_lop = lop.ma_lop
    INNER JOIN giao_vien ON lop.ma_gvcn = giao_vien.ma_gv
    INNER JOIN phu_trach_bo_mon pt ON giao_vien.ma_gv = pt.ma_gvpt
    INNER JOIN mon_hoc mh ON pt.ma_mh = mh.ma_mh



# e. MaHS, HoTenHS, MaLop, MaGVCN, HoTenGV (chủ nhiệm), HocKy, MaMH, TenMH, DiemThiGiuaKy, DiemThiCuoiKy, MaGV (phụ trách), HoTenGV (phụ trách) của những học sinh nữ với các môn học đã có kết quả thi cuối kỳ hoặc giữa kỳ được 9 điểm trở lên.
# f. MaHS, HoTenHS, HocKy, MaMH, TenMH, DiemThiGiuaKy, DiemThiCuoiKy, MaLop, MaGV (phụ trách), HoTenGV (phụ trách) của học sinh và các môn học đã có kết quả tương ứng với từng học sinh trong trường. Với điều kiện là chỉ hiển thị những môn học mà giáo viên phụ trách môn đó cũng chính là giáo viên chủ nhiệm của lớp.
# g. MaMH, MaLop, HocKy của những môn học đã được thi cuối kỳ vào năm 2023
# h. MaMH, MaLop, HocKy của những môn học đã được thi vào tháng 8 năm 2023
# i. MaMH, MaLop, HocKy của những môn học đã được thi trước ngày 20 tháng 8 năm 2023
# j. MaMH, MaLop, HocKy của những môn học đã được thi trước ngày 20 tháng 8 năm 2023 đúng 1 tuần.
# k. MaMH, MaLop, HocKy của những môn học đã được thi sau ngày 20 tháng 8 năm 2023 đúng 21 ngày.
# l. MaMH, MaLop, HocKy của những môn học đã được thi trong khoảng từ ngày 10 đến ngày 20 tháng 8 năm 2023.
# m. MaMH, MaLop, HocKy của những môn học đã được thi trong khoảng từ 10 giờ 00 phút ngày 10 đến 20 giờ 30 phút ngày 20 tháng 8 năm 2023