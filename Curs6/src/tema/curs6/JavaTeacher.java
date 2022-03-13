package tema.curs6;


//@Component("myTeacher")
    public class JavaTeacher implements ITeacher{
        private WisdomWordsService wisdomWordsService;
        private HomeWorkService homeWorkService;
        int age;

        public JavaTeacher(WisdomWordsService wisdomWordsService) {
            this.wisdomWordsService = wisdomWordsService;
        }

        public JavaTeacher(HomeWorkService homeWorkService) {
            this.homeWorkService = homeWorkService;
        }

        public JavaTeacher(WisdomWordsService wisdomWordsService, HomeWorkService homeWorkService, int age) {
            this.wisdomWordsService = wisdomWordsService;
            this.homeWorkService = homeWorkService;
            this.age = age;
        }

        @Override
        public String getHomework() {
            return "Create 100 classes";
        }

        @Override
        public String getWisdom() {
            return wisdomWordsService.getMessage();
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
