package be.pxl.services.services;

import be.pxl.services.domain.dto.EmployeeRequest;
import be.pxl.services.domain.dto.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEmployeeService {
    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse getEmployeeByDepartmentId(Long departmentId);

    EmployeeResponse getEmployeeByOrganizationId(Long organizationId);

    void addEmployee(EmployeeRequest employeeRequest);


}
