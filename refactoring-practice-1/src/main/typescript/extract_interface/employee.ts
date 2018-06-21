export class Employee {

    private firstName: string;
    private lastName: string;
    private middleName: string;
    private dateOfBirth: Date;
    private rate: number;
    private specialSkilled: boolean;

    public getFirstName(): string {
        return this.firstName;
    }

    public setFirstName(firstName: string) {
        this.firstName = firstName;
    }

    public getLastName(): string {
        return this.lastName;
    }

    public setLastName(lastName: string) {
        this.lastName = lastName;
    }

    public getMiddleName(): string {
        return this.middleName;
    }

    public setMiddleName(middleName: string) {
        this.middleName = middleName;
    }

    public getDateOfBirth(): Date {
        return this.dateOfBirth;
    }

    public setDateOfBirth(dateOfBirth: Date) {
        this.dateOfBirth = dateOfBirth;
    }

    public getRate(): number {
        return this.rate;
    }

    public setRate(rate: number) {
        this.rate = rate;
    }

    public isSpecialSkilled(): boolean {
        return this.specialSkilled;
    }

    public setSpecialSkilled(specialSkills: boolean) {
        this.specialSkilled = specialSkills;
    }

}
