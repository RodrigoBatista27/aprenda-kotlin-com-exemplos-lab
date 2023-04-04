import model.User
import repository.AcademicFormationRepository
import repository.EducationalContentRepository

fun main() {

    val user1 = User("Rodrigo", "rodrigo@gmail.com", "12345")
    val user2 = User("Rafael", "rafael@gmail.com", "12345")

    val formations = EducationalContentRepository

    val academicFormationRepository = AcademicFormationRepository()

    academicFormationRepository.toSubscribedAndPrintIt(user1, formations.academicFormationsList()[0])
    academicFormationRepository.toSubscribedAndPrintIt(user2, formations.academicFormationsList()[1])
}