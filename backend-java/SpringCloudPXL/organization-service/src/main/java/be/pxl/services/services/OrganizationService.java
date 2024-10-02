package be.pxl.services.services;


import be.pxl.services.domain.Organization;
import be.pxl.services.domain.dto.OrganizationResponse;
import be.pxl.services.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService{
    private final OrganizationRepository organizationRepository;


    @Override
    public OrganizationResponse getOrganizationById(Long id) {
        Organization organization = organizationRepository.getOrganizationById(id);
        return OrganizationResponse.builder()
                .name(organization.getName())
                .address(organization.getAddress())
                .build();
    }

    @Override
    public OrganizationResponse getOrganizationWithEmployees(Long id) {
        Organization organization = organizationRepository.getOrganizationById(id);
        return OrganizationResponse.builder()
                .name(organization.getName())
                .address(organization.getAddress())
                .employees(organization.getEmployees())
                .build();
    }

    @Override
    public OrganizationResponse getOrganizationWithDepartments(Long id) {
        Organization organization = organizationRepository.getOrganizationById(id);
        return OrganizationResponse.builder()
                .name(organization.getName())
                .address(organization.getAddress())
                .departments(organization.getDepartments())
                .build();
    }

    @Override
    public OrganizationResponse getOrganizationWithEmployeesAndDepartments(Long id) {
        Organization organization = organizationRepository.getOrganizationById(id);
        return OrganizationResponse.builder()
                .name(organization.getName())
                .address(organization.getAddress())
                .employees(organization.getEmployees())
                .departments(organization.getDepartments())
                .build();
    }


}
