var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":30820,"methods":[],"name":"TestContextualWithAnnDeserializer","sl":15},{"el":22,"id":30820,"methods":[],"name":"TestContextualWithAnnDeserializer.Name","sl":20},{"el":28,"id":30820,"methods":[{"el":27,"sc":9,"sl":27}],"name":"TestContextualWithAnnDeserializer.StringValue","sl":24},{"el":35,"id":30822,"methods":[],"name":"TestContextualWithAnnDeserializer.AnnotatedContextualClassBean","sl":30},{"el":66,"id":30822,"methods":[{"el":43,"sc":9,"sl":43},{"el":46,"sc":9,"sl":44},{"el":52,"sc":9,"sl":48},{"el":65,"sc":9,"sl":54}],"name":"TestContextualWithAnnDeserializer.AnnotatedContextualDeserializer","sl":37},{"el":93,"id":30838,"methods":[{"el":74,"sc":9,"sl":74},{"el":77,"sc":9,"sl":75},{"el":83,"sc":9,"sl":79},{"el":92,"sc":9,"sl":85}],"name":"TestContextualWithAnnDeserializer.MyContextualDeserializer","sl":68}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
