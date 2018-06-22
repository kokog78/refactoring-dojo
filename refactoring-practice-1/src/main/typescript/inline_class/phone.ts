export class Phone {

    private areaCode: string;
    private number: string;

    public getTelephoneNumber() {
        return "(" + this.areaCode + ") " + this.number;
    }

    public getAreaCode() {
        return this.areaCode;
    }

    public setAreaCode(areaCode: string) {
        this.areaCode = areaCode;
    }

    public getNumber() {
        return this.number;
    }

    public setNumber(number: string) {
        this.number = number;
    }


}
