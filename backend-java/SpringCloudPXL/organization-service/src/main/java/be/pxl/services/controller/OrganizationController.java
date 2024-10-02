package be.pxl.services.controller;


import be.pxl.services.services.IOrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organization")
@RequiredArgsConstructor
public class OrganizationController {

    private final IOrganizationService organizationService;

    @GetMapping("/{id}")
    public ResponseEntity getOrganizationById(Long id) {
        return ResponseEntity.ok(organizationService.getOrganizationById(id));
    }

    @GetMapping("/{id}/with-employees")
    public ResponseEntity getOrganizationWithEmployees(Long id) {
        return ResponseEntity.ok(organizationService.getOrganizationWithEmployees(id));
    }

    @GetMapping("/{id}/with-departments")
    public ResponseEntity getOrganizationWithDepartments(Long id) {
        return ResponseEntity.ok(organizationService.getOrganizationWithDepartments(id));
    }

    @GetMapping("/{id}/with-employees-and-departments")
    public ResponseEntity getOrganizationWithEmployeesAndDepartments(Long id) {
        return ResponseEntity.ok(organizationService.getOrganizationWithEmployeesAndDepartments(id));
    }



}
