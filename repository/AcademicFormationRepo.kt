package repository

import model.AcademicFormation
import model.User
import org.jetbrains.annotations.NotNull

class AcademicFormationRepo  {
    
    @NotNull
    private var inscritos = mutableListOf<User>()
    Private var inscritosEmCursos = mutableListOf<AcademicFormation>

    internal fun ParaInscritos(user: User, academicFormation: AcademicFormation) {
        inscritos.add(user)
        inscritosEmCursos.add(academicFormation)
        println    
    }
}