package org.yicheng.record;

import org.yicheng.database.Database;

import java.util.HashMap;

public class SummaryAttendanceRecord {
    private static HashMap<Integer, PersonalAttendanceRecord> records;

    public static PersonalAttendanceRecord getPersonalAttendanceRecord(int studentId) {
        return records.get(studentId);
    }
}
