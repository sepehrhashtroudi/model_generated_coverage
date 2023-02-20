var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":111,"id":5241,"methods":[{"el":45,"sc":3,"sl":41},{"el":55,"sc":1,"sl":48}],"name":"EnumTest","sl":37},{"el":77,"id":5250,"methods":[{"el":76,"sc":5,"sl":74}],"name":"EnumTest.MyEnum","sl":71},{"el":85,"id":5252,"methods":[{"el":84,"sc":5,"sl":82}],"name":"EnumTest.ClassWithEnumFields","sl":79},{"el":110,"id":5254,"methods":[{"el":96,"sc":7,"sl":94},{"el":101,"sc":7,"sl":99},{"el":106,"sc":7,"sl":104}],"name":"EnumTest.Roshambo","sl":92}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_76":{"methods":[{"sl":48}],"name":"testEnumSubclass5","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [76], [76], [76], [76], [76], [76], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
