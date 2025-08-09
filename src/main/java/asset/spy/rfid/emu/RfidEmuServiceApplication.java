package asset.spy.rfid.emu;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@OpenAPIDefinition(info = @Info(title = "Asset spy rfid emulator service API",
        description = "Rest API for rfid emulator service", version = "1.0.0"))
public class RfidEmuServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RfidEmuServiceApplication.class, args);
    }
}
