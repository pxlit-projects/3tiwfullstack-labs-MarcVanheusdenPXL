package be.pxl.services.services;

import be.pxl.services.domain.dto.DepartmentRequest;
import be.pxl.services.domain.dto.DepartmentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDepartmentService {
    List<DepartmentResponse> getAllDepartments();

    DepartmentResponse getDepartmentById(Long id);

    DepartmentResponse getDepartmentByOrganizationId(Long organizationId);

    DepartmentResponse getDepartmentByOrganizationIdWithEmployees(Long organizationId);


    void addDepartment(DepartmentRequest departmentRequest);
}
