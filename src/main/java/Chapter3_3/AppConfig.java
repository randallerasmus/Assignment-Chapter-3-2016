package Chapter3_3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Chapter3_3.services.Impl.EmployeeServiceImpl;
import za.ac.cput.Chapter3_3.services.Impl.StudentServiceImpl;
import za.ac.cput.Chapter3_3.services.PersonInterface;

/**
 * Created by User on 2016/10/25.
 */
@Configuration
public class AppConfig {
    @Bean(name="student")
    public PersonInterface getStudent(){
        return new StudentServiceImpl("Randall", "Erasmus", "204527058", "Fulltime");
    }

    @Bean(name="employee")
    public PersonInterface getEMployee()
    {
        return new EmployeeServiceImpl("John","Wick","5555","Permanent");
    }
}
