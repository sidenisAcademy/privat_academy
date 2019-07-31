package REST_testing.Kutsenko;

import com.jayway.restassured.response.Header;
import org.junit.Test;

import java.util.List;

public class TestRequests {

    @Test
    public void requestTest() {

//        Integer newId = PetSteps.stepAddPet(604);
//        PetSteps.stepGetPetById(newId);
//        PetSteps.stepDeletePet(newId);
//        PetSteps.stepCheckPetNotFound(newId);
//        PetSteps.stepUserLogin("me", "123");
//        PetSteps.stepSix("me1", "456");
//        PetSteps.stepSeven("me1", "456");
//        String token = PetSteps.stepEight("me1", "456");
//        PetSteps.stepNine(token);

        Integer newPetWithSetterId = PetSteps.stepAddPetWithSetter();
        PetSteps.stepGetPetById(newPetWithSetterId);
        PetSteps.stepDeletePet(newPetWithSetterId);

        Integer newPetWithAllArgsConstructor = PetSteps.stepAddPetWithAllArgsConstructor();
        PetSteps.stepGetPetById(newPetWithAllArgsConstructor);
        PetSteps.stepDeletePet(newPetWithAllArgsConstructor);

        Integer newPetWithBuilder = PetSteps.stepAddPetWithBuilder();
        PetSteps.stepGetPetById(newPetWithBuilder);
        PetSteps.stepDeletePet(newPetWithBuilder);

    }
}