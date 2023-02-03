var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":118,"id":5212,"methods":[{"el":45,"sc":3,"sl":41},{"el":55,"sc":1,"sl":48},{"el":62,"sc":1,"sl":58}],"name":"EnumTest","sl":37},{"el":84,"id":5225,"methods":[{"el":83,"sc":5,"sl":81}],"name":"EnumTest.MyEnum","sl":78},{"el":92,"id":5227,"methods":[{"el":91,"sc":5,"sl":89}],"name":"EnumTest.ClassWithEnumFields","sl":86},{"el":117,"id":5229,"methods":[{"el":103,"sc":7,"sl":101},{"el":108,"sc":7,"sl":106},{"el":113,"sc":7,"sl":111}],"name":"EnumTest.Roshambo","sl":99}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_176":{"methods":[{"sl":48}],"name":"testEnumSubclass4","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53}]},"test_64":{"methods":[{"sl":58},{"sl":81}],"name":"testTopLevelEnumInASingleElementArrayDeserialization133","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":82}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [176], [176], [176], [176], [176], [176], [], [], [], [], [64], [64], [64], [64], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [64], [64], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
