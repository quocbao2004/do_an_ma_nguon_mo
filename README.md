# REAL ESTATE MANAGEMENT SYSTEM
> Hệ thống Quản lý và Kinh doanh Bất động sản (Java Spring Boot)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

## Giới thiệu (Overview)
Dự án là nền tảng website hỗ trợ kết nối giữa đơn vị kinh doanh bất động sản và khách hàng. Hệ thống cung cấp công cụ quản lý toàn diện cho Admin/Nhân viên và giao diện tìm kiếm thông minh cho Khách hàng.

Dự án được xây dựng theo kiến trúc **MVC**, sử dụng **Spring Security + JWT** để bảo mật và phân quyền.

---

## Tính năng chính (Features)

### 1. Phân hệ Quản trị (Admin/Staff)
- **Quản lý Tòa nhà:** Thêm, Sửa, Xóa, Upload hình ảnh, Xem chi tiết.
- **Quản lý Người dùng:** Quản lý danh sách nhân viên và khách hàng.
- **Nghiệp vụ Chăm sóc khách hàng:** Phân công (Giao) khách hàng cho nhân viên phụ trách.
- **Nghiệp vụ Quản lý tòa nhà:** Phân công (Giao) tòa nhà cho nhiều nhân viên phụ trách.
- **Thống kê:** Xem danh sách tòa nhà, khách hàng đang quản lý.

### 2. Phân hệ Khách hàng (User/Public)
- **Tìm kiếm nâng cao:** Lọc theo Tên, Diện tích, Giá thuê, Quận, Hướng...
- **Trang chủ:** Hiển thị danh sách sản phẩm nổi bật.
- **Tài khoản:** Đăng ký, Đăng nhập, Quản lý hồ sơ cá nhân (Profile), Đổi mật khẩu.
- **Bảo mật:** Cơ chế xác thực Token (JWT), Mã hóa mật khẩu (BCrypt).

---

## 🛠 Công nghệ sử dụng (Tech Stack)

| Hạng mục | Công nghệ |
| :--- | :--- |
| **Backend Core** | Java 8, Spring Boot |
| **Database** | MySQL, Spring Data JPA (Hibernate) |
| **Frontend** | JSP, JSTL, Bootstrap 3, JQuery |
| **Security** | Spring Security, JWT (JSON Web Token) |
| **Build Tool** | Maven |
| **Version Control** | Git, GitHub (Git Flow Strategy) |

---

## Thành viên & Phân công (Team & Roles)

Dự án được phát triển bởi nhóm 3 thành viên theo mô hình phân chia Module:

| Thành viên | Vai trò (Role) | Module phụ trách |
| :--- | :--- | :--- | 
| **[Quốc Bảo]** | **Team Leader / System** | Khởi tạo Project, Security (Login/JWT), Profile
| **[Thuận Phát]** | **Product Manager** | Quản lý Tòa nhà (Building CRUD), Tìm kiếm (Search API) 
| **[Tấn Phát]** | **CRM Developer** | Quản lý User/Staff, Nghiệp vụ Giao khách hàng, Trang chủ 

---

## Quy trình quản lý mã nguồn (Git Flow)

Nhóm áp dụng chặt chẽ mô hình Git Flow để quản lý mã nguồn, với mọi hoạt động phát triển và tích hợp đều xoay quanh nhánh develop.

1. Chiến lược phân nhánh (Branching Strategy)
main (Production): Nhánh chứa mã nguồn ổn định nhất, chỉ được cập nhật khi hoàn tất một phiên bản (Release). Tuyệt đối không push code trực tiếp.

develop (Development): Nhánh phát triển chính. Đây là nơi tích hợp mã nguồn của tất cả thành viên. Mọi tính năng mới đều phải được merge vào đây trước khi đưa sang main.

feature/... (Feature Branches): Các nhánh chức năng riêng biệt được tách ra từ develop. Mỗi thành viên làm việc trên nhánh feature của mình.

2. Quy trình làm việc (Workflow)
Từ nhánh develop, thành viên tách nhánh feature (VD: feature/login, feature/building).

Thực hiện code và commit trên nhánh feature.

Tạo Pull Request (PR) để merge code từ nhánh feature về lại develop.

Sau khi review và merge xong, nhánh develop sẽ chứa code mới nhất của cả nhóm.

<img width="1170" height="649" alt="image" src="https://github.com/user-attachments/assets/b20497e2-e30c-49f7-9302-238f1843011e" />

