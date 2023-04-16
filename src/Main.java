class Program {
    public static void TimeToSleep(long secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        long secondsToSleep = 5;
        System.out.println("Загрузка замка...");
        TimeToSleep(secondsToSleep);

        User TheKing = new UserImpl(mediator, "Король Ричард", "решает королевские проблемы");
        User WatchmanGerald = new UserImpl(mediator, "Смотрящий Геральд","отдыхает");
        User WatchmanJohn = new UserImpl(mediator, "Смотрящий Джон","отдыхает");
        User WatchmanPiter = new UserImpl(mediator, "Смотрящий Питер","отдыхает");
        User WatchmanVans = new UserImpl(mediator, "Смотрящий Ванс","отдыхает");
        System.out.println();

        mediator.addUser(TheKing);
        mediator.addUser(WatchmanGerald);
        mediator.addUser(WatchmanJohn);
        mediator.addUser(WatchmanPiter);
        mediator.addUser(WatchmanVans);

        TheKing.showStatus();
        WatchmanJohn.showStatus();
        WatchmanGerald.showStatus();
        WatchmanPiter.showStatus();
        WatchmanVans.showStatus();

        System.out.println();
        System.out.println("Королю пришло письмо об объявлении войны...");
        TimeToSleep(secondsToSleep);
        System.out.println("В королевстве начинается паника...");
        TimeToSleep(secondsToSleep);
        System.out.println();

        TheKing.send("Всем смотрящим явиться на свои места и готовиться к обороне!");
        TimeToSleep(secondsToSleep);
        TheKing.setStatus("нервно ожидает нападения противников");
        WatchmanGerald.setStatus("вступил в пост на Северную Башню");
        WatchmanPiter.setStatus("вступил в пост на Южную Башню");
        WatchmanJohn.setStatus("вступил в пост на Западную башню");
        WatchmanVans.setStatus("вступил в пост на Восточную башню");
        System.out.println();
        TheKing.showStatus();
        WatchmanJohn.showStatus();
        WatchmanGerald.showStatus();
        WatchmanPiter.showStatus();
        WatchmanVans.showStatus();
        System.out.println();
        TimeToSleep(secondsToSleep);

        WatchmanGerald.send("Замечен враг с Северной Башни.");
        System.out.println();
        TimeToSleep(secondsToSleep);
        TheKing.send("Всем смотрящим ретироваться на Северную Башню!!!");
        TimeToSleep(secondsToSleep);
        TheKing.setStatus("нервно ожидает нападения противников");
        WatchmanGerald.setStatus("держит оборону на Северной Башне");
        WatchmanPiter.setStatus("перебрался и держит оборону на Северной Башне");
        WatchmanJohn.setStatus("перебрался и держит оборону на Северной Башне");
        WatchmanVans.setStatus("перебрался и держит оборону на Северной Башне");
        System.out.println();
        TimeToSleep(secondsToSleep);
        TheKing.showStatus();
        WatchmanJohn.showStatus();
        WatchmanGerald.showStatus();
        WatchmanPiter.showStatus();
        WatchmanVans.showStatus();
        System.out.println();

        TimeToSleep(secondsToSleep);
        System.out.println("Ту би континуед...");
    }
}

