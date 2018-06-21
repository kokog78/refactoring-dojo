import {Person} from "../../../main/typescript/extract_class/person.js";

describe('Person', () => {

    it('getOfficeTelephoneNumber_should_get_office_telephone_number', () => {
        let person: Person = new Person();
        person.setOfficeAreaCode("1");
        person.setOfficeNumber("654321");
        expect(person.getOfficeTelephoneNumber()).toBe("(1) 654321");
    });
});