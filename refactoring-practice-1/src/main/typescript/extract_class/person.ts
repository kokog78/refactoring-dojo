/*
 * Emeljük ki a telefonszámot egy külön osztályba!
 */
export class Person {

    private officeAreaCode: string;
    private officeNumber: string;
    private name: string;

    public getOfficeTelephoneNumber(): string {
        return "(" + this.officeAreaCode + ") " + this.officeNumber;
    }

    public getOfficeAreaCode(): string {
        return this.officeAreaCode;
    }

    public setOfficeAreaCode(officeAreaCode: string) {
        this.officeAreaCode = officeAreaCode;
    }

    public getOfficeNumber(): string {
        return this.officeNumber;
    }

    public setOfficeNumber(officeNumber: string) {
        this.officeNumber = officeNumber;
    }

    public getName(): string {
        return this.name;
    }

    public setName(name: string) {
        this.name = name;
    }
}
