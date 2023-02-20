var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":113,"id":5546,"methods":[{"el":44,"sc":3,"sl":40},{"el":55,"sc":1,"sl":47},{"el":63,"sc":1,"sl":58}],"name":"NamingPolicyTest","sl":36},{"el":93,"id":5562,"methods":[{"el":92,"sc":5,"sl":90}],"name":"NamingPolicyTest.UpperCaseNamingStrategy","sl":89},{"el":112,"id":5564,"methods":[{"el":102,"sc":5,"sl":100},{"el":106,"sc":5,"sl":104},{"el":111,"sc":5,"sl":108}],"name":"NamingPolicyTest.ClassWithDuplicateFields","sl":96}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_108":{"methods":[{"sl":47},{"sl":100},{"sl":104},{"sl":108}],"name":"testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization114","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":101},{"sl":105},{"sl":109},{"sl":110}]},"test_179":{"methods":[{"sl":58}],"name":"testGsonWithUpperCamelCaseSpacesPolicyDeserialiation156","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [108], [108], [108], [108], [108], [108], [108], [108], [], [], [], [179], [179], [179], [179], [179], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [108], [108], [], [], [108], [108], [], [], [108], [108], [108], [], [], []]
