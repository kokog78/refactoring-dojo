export class Course {

    constructor(private name: string, private advanced: boolean) {
    }

    getName(): string {
        return this.name;
    }

    isAdvanced(): boolean {
        return this.advanced;
    }
}
