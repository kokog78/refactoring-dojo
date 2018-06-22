import {Person} from "../../../main/typescript/inline_class/person.js";

describe('inline_class: Person', () => {

    it('getOfficeTelephoneNumber_should_get_office_telephone_number', () => {
        let person: Person = new Person();
        person.getOfficePhone().setAreaCode("1");
        person.getOfficePhone().setNumber("654321");
        expect(person.getOfficePhone().getTelephoneNumber()).toBe("(1) 654321");

    });
});