package be.pxl.services.services;

import be.pxl.services.domain.dto.OrganizationResponse;
import org.springframework.stereotype.Service;

@Service
public interface IOrganizationService {
    OrganizationResponse getOrganizationById(Long id);

    OrganizationResponse getOrganizationWithEmployees(Long id);

    OrganizationResponse getOrganizationWithDepartments(Long id);

    OrganizationResponse getOrganizationWithEmployeesAndDepartments(Long id);

}
