package com.apolloclinicmalda.features.attendance.api

import com.apolloclinicmalda.features.attendance.model.AttendanceRequest
import com.apolloclinicmalda.features.attendance.model.AttendanceResponse
import com.apolloclinicmalda.features.attendance.model.DayStartEndListResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class AttendanceListRepository(val apiService: AttendanceListApi) {
    fun getAttendanceList(attendanceRequest: AttendanceRequest?): Observable<AttendanceResponse> {
        return apiService.getAttendanceList(attendanceRequest)
    }

    fun getDayStartEndList(attendanceRequest: AttendanceRequest?): Observable<DayStartEndListResponse> {
        return apiService.getDayStartEndListAPI(attendanceRequest)
    }
}