/*
 * Hozzunk létre egy getManager metódust, ami visszaadja a department.manager értékét,
 * így elrejthető a department mező.
 */
import {Department} from "./department.js";

export class Person {

    private department: Department;

    public getDepartment() {
        return this.department;
    }

    public setDepartment(department: Department) {
        this.department = department;
    }
}
