import {ResidentalSite} from "../../../main/typescript/form_template_method/residental-site.js";
import {LifelineSite} from "../../../main/typescript/form_template_method/lifeline-site.js";

describe('Site', () => {

    it('getBillableAmount_should_get_billable_amount_correctly', () => {
        let residentalSite: ResidentalSite = new ResidentalSite(3, 1000.0);
        let lifelineSite: LifelineSite = new LifelineSite(3, 1000.0);
        expect(residentalSite.getBillableAmount()).toBe(3810.0);
        expect(lifelineSite.getBillableAmount()).toBe(1986.0);

    });
});