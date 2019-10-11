package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Avaliacao {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Avaliacao
public static Var ObterDados() throws Exception {
 return new Callable<Var>() {

   private Var Dados = Var.VAR_NULL;

   public Var call() throws Exception {
    Dados = cronapi.list.Operations.newList();
    cronapi.list.Operations.addLast(Dados,cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",Var.valueOf("1")) , Var.valueOf("nome",Var.valueOf("P1")) , Var.valueOf("descricao",Var.valueOf("Notas de provas do primeiro semestre")) , Var.valueOf("fk_turma",Var.valueOf("E0E72A66-667A-4C00-B642-E73B9A074DAE	")) , Var.valueOf("ordem",Var.valueOf("1"))));
    cronapi.list.Operations.addLast(Dados,cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",Var.valueOf("2")) , Var.valueOf("nome",Var.valueOf("P2")) , Var.valueOf("descricao",Var.valueOf("Notas de provas do segundo semestre")) , Var.valueOf("fk_turma",Var.valueOf("E0E72A66-667A-4C00-B642-E73B9A074DAE	")) , Var.valueOf("ordem",Var.valueOf("2"))));
    cronapi.list.Operations.addLast(Dados,cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",Var.valueOf("3")) , Var.valueOf("nome",Var.valueOf("EX")) , Var.valueOf("descricao",Var.valueOf("Notas de recuperação")) , Var.valueOf("fk_turma",Var.valueOf("E0E72A66-667A-4C00-B642-E73B9A074DAE	")) , Var.valueOf("ordem",Var.valueOf("3"))));
    cronapi.list.Operations.addLast(Dados,cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",Var.valueOf("4")) , Var.valueOf("nome",Var.valueOf("Média")) , Var.valueOf("descricao",Var.valueOf("Consulte aqui a média de cada aluno")) , Var.valueOf("fk_turma",Var.valueOf("E0E72A66-667A-4C00-B642-E73B9A074DAE	")) , Var.valueOf("ordem",Var.valueOf("4"))));
    System.out.println(Dados.getObjectAsString());
    return cronapi.json.Operations.toJson(Dados);
   }
 }.call();
}

}

