var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":95,"id":31913,"methods":[{"el":68,"sc":1,"sl":57},{"el":77,"sc":1,"sl":71}],"name":"TestSetterlessProperties","sl":15},{"el":29,"id":31913,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestSetterlessProperties.CollectionBean","sl":24},{"el":36,"id":31915,"methods":[{"el":35,"sc":9,"sl":35}],"name":"TestSetterlessProperties.MapBean","sl":31},{"el":48,"id":31917,"methods":[{"el":43,"sc":9,"sl":43},{"el":47,"sc":9,"sl":45}],"name":"TestSetterlessProperties.Dual","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_192":{"methods":[{"sl":57}],"name":"testSimpleSetterlessCollectionFailure360","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":66}]},"test_300":{"methods":[{"sl":35},{"sl":71}],"name":"testSimpleSetterlessMapOk382","pass":true,"statements":[{"sl":35},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [300], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [192], [192], [192], [192], [192], [192], [192], [], [], [192], [], [], [], [], [300], [300], [300], [300], [300], [300], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
