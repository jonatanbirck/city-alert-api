package br.com.univates.citymobileapi.util;

import br.com.univates.citymobileapi.model.Information;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MockObjects {

    /*
    public static List<Alert> createManyAlert(int howMany) {
        List<Alert> alerts = new ArrayList<>(howMany);
        for (int i = 1; i <= howMany; i++) {
            alerts.add(createAlert(i));
        }
        return alerts;
    }

    public String getImageInBase64(File file) {
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(file);
            return Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            return null;
        }
    }

    public static Alert createAlert(int i) {
        Alert alert = new Alert();
        alert.setId(i);
        alert.setPhoto(getImageInBase64(new File("C:\\Users\\Jonatan\\Desktop\\Sem título.png")));
        alert.setType(Alert.Type.TRASH);
        alert.setPosition(new LatLng(-29.505503, -51.967846));
        alert.setRouteId(1);
        alert.setObservation("Lixo na rua, na lateral do bar");
        return alert;
    }

    public static List<Route> createManyRoute(int howMany) {
        List<Route> routes = new ArrayList<>(howMany);
        for (int i = 1; i <= howMany; i++) {
            routes.add(createRoute(i));
        }
        return routes;
    }

    public static Route createRoute(int index) {
        Route route = new Route();
        route.setId(index);
        route.setAlerts(List.of(createAlert(1), createAlert(2)));
        route.setName("Rota " + index);
        route.setPositions(List.of(
            new LatLng(-29.505232, -51.967808)
        ));
        route.setStartPosition(new LatLng(-29.505503, -51.967846));
        route.setEndPosition(new LatLng(-29.505107, -51.967789));
        return route;
    }
    */

    public static Information getInformation() {
        Information information = new Information();
        information.setText("A sustentabilidade é um conceito fundamental para garantir o equilíbrio entre o desenvolvimento humano e a preservação do meio ambiente. Ela envolve a adoção de práticas e medidas que visam atender às necessidades presentes, sem comprometer a capacidade das futuras gerações de suprir suas próprias demandas.  No centro da sustentabilidade está a conscientização de que os recursos naturais são limitados e precisam ser utilizados de forma responsável. Isso implica em buscar alternativas mais eficientes e menos impactantes, tanto na produção de bens e serviços quanto no consumo desses recursos. A sustentabilidade engloba três pilares fundamentais: o social, o econômico e o ambiental. O pilar social diz respeito à garantia de condições dignas de vida para todas as pessoas, levando em consideração aspectos como saúde, educação, segurança, igualdade de oportunidades e respeito aos direitos humanos.  O pilar econômico busca conciliar o crescimento econômico com a equidade social e a preservação do meio ambiente. Isso envolve a promoção de negócios sustentáveis, que considerem não apenas o lucro imediato, mas também os impactos de longo prazo nas comunidades e no planeta.  Já o pilar ambiental está relacionado à conservação dos recursos naturais e à redução dos impactos ambientais. Isso implica em adotar práticas de produção e consumo conscientes, que minimizem a geração de resíduos, reduzam a poluição, promovam a reciclagem e busquem fontes de energia limpas e renováveis. A sustentabilidade também está intrinsecamente ligada ao combate às mudanças climáticas, que representam uma das maiores ameaças ao equilíbrio do planeta. Nesse sentido, é importante promover a transição para uma economia de baixo carbono, reduzindo as emissões de gases de efeito estufa e buscando soluções sustentáveis para os desafios ambientais. Além disso, a sustentabilidade envolve a conscientização e a participação ativa de todos os setores da sociedade: governos, empresas, organizações não governamentais e cidadãos. É necessário fomentar a educação ambiental, incentivar a pesquisa científica e promover ações coletivas para transformar o modelo atual de desenvolvimento em um modelo mais sustentável. Em resumo, a sustentabilidade é um princípio que busca conciliar o bem-estar humano com a proteção do meio ambiente, promovendo a utilização responsável dos recursos naturais, a equidade social e o crescimento econômico sustentável. É um desafio complexo, porém essencial para garantir um futuro melhor para as próximas gerações.");
        information.setTitle("O que é sustentabilidade?");
        information.setImageLink("https://blog.urbanflowers.com.br/wp-content/uploads/2019/03/282065-teoria-da-sustentabilidade-como-aplicala-na-pratica.jpg");
        return information;
    }

}
