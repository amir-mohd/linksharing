package com.linksharing

class DashboardController {

    def dashBoardService
    def dashboard()
    {


        /*def dashBoardUserInfo=dashBoardService.getDashBoardUserInfo(session["id"])
        render(view: '/dashboard/dashboard',model: [dashBoardUserInfo:dashBoardUserInfo])*/
    }
    def markasread()
    {
        long readingid=Long.parseLong(params.id)
        if(dashBoardService.markAsRead(readingid))
        {
        //    redirect(controller: 'topic' ,action:'view' ,id:params.topic)
                render 'success'
        }
        else
        {
            render "faild"
        }
    }
    def deleteTopic()
    {

        if(dashBoardService.deleteTopic(Long.parseLong(params.id)))
        {
            redirect(action:'dashboard')
        }
        else
        {
            render "Sorry Please Try Again"
        }
    }
}
