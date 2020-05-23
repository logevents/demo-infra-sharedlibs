def call(String checkoutDate){
    println("checkoutByDate using $checkoutDate")

    if(!checkoutDate.equals("now")){
        sh "git rev-list -1 --before=\"$checkoutDate\" --date=\"format:dd.mm.yyyy\" origin/master"
        sh "git checkout `git rev-list -1 --before=\"$checkoutDate\" --date=\"format:dd.mm.yyyy\" origin/master`"
    }else{
        println("do nothing because checkoutdate is now")
    }

}