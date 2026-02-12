package com.example.SalesSavvy.AdminControllers;

import com.example.SalesSavvy.Adminservices.AdminBusinessService;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/admin/business")
public class AdminBusinessController {
    private final AdminBusinessService adminBusinessService;

    public AdminBusinessController(AdminBusinessService adminBusinessService) {
        this.adminBusinessService = adminBusinessService;
    }

    @GetMapping("/monthly")
    public ResponseEntity<?> getMonthlyBusiness(@RequestParam String month, @RequestParam String  year){
        try {
            Map<String,Object> businessReport =adminBusinessService.calculateMonthlyBusiness(Integer.parseInt(month),Integer.parseInt(year));
            return ResponseEntity.status(HttpStatus.OK).body(businessReport);
        } catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
    @GetMapping("/daily")
    public ResponseEntity<?> getDailyBusiness(@RequestParam String date){
        try {
            LocalDate localDate=LocalDate.parse(date);
            Map<String, Object> businessReport=adminBusinessService.calculateDailyBusiness(localDate);
            return ResponseEntity.status(HttpStatus.OK).body(businessReport);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
    @GetMapping("/yearly")
    public ResponseEntity<?> getYearlyBusiness(@RequestParam String year){
        try {
            Map<String,Object> businessReport=adminBusinessService.calculateYearlyBusiness(Integer.parseInt(year));
            return ResponseEntity.status(HttpStatus.OK).body(businessReport);
        } catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
    @GetMapping("/overall")
    public ResponseEntity<?> getOverallBusiness(){
        try {
            Map<String,Object> overallBusiness=adminBusinessService.calculateOverallBusiness();
            return ResponseEntity.status(HttpStatus.OK).body(overallBusiness);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong while calculating overall business");

        }
    }

}
