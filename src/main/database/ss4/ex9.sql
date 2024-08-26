-- a. Liệt kê ma_học_sinh, ho_ten_hoc_sinh, gioi_tinh, ma_lop, ten_lop, ma_gvcn của tất cả học sinh trong trường.
    SELECT ma_hs, ho_ten_hs, gioi_tinh, lop.ma_lop, lop.ten_lop, lop.ma_gvcn FROM hoc_sinh
    INNER JOIN lop ON hoc_sinh.ma_lop = lop.ma_lop;

-- b. Liệt kê ma_học_sinh, ho_ten_hoc_sinh, hoc_ky, ma_mon_hoc, diem_thi_giua_ky, diem_thi_cuoi_ky của tất cả học sinh và các môn học có kết quả tương ứng với từng học sinh trong trường.
    SELECT ma_hs, ho_ten_hs, kq.hoc_ky, kq.ma_mh, kq.diem_thi_giua_ky, kq.diem_thi_cuoi_ky FROM hoc_sinh
    INNER JOIN ket_qua_hoc_tap kq ON hoc_sinh.ma_hs = kq.ma_hs;

-- c. Liệt kê ma_giao_vien, ho_ten_giao_vien, ma_lop, ma_mon_hoc, hoc_ky của những giáo viên đã được giao phụ trách ít nhất một môn học.
    SELECT ma_gv, ho_ten_gv, pt.ma_lop, pt.ma_mh, pt.hoc_ky FROM giao_vien
    INNER JOIN phu_trach_bo_mon pt ON giao_vien.ma_gv = pt.ma_gvpt;

-- d. Suy nghĩ về yêu cầu a ở trên: Nếu học sinh chưa được phân lớp thì liệu có liệt kê được học sinh đó không?
#     Không

-- e. Suy nghĩ về yêu cầu b ở trên: Nếu học sinh chưa có kết quả thi của môn nào cả thì liệu có liệt kê được học sinh đó không?
#     Được

-- f. Suy nghĩ về yêu cầu c ở trên: Nếu giáo viên chưa phụ trách một môn nào cả thì liệu có liệt kê được giáo viên đó không?
#     Được
